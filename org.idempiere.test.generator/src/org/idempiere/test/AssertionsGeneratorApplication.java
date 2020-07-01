/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 2010 Heng Sin Low                							  *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 *****************************************************************************/
package org.idempiere.test;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.compiere.Adempiere;
import org.idempiere.test.generator.AssertionsGeneratorDialog;
import org.idempiere.test.generator.ModelAssertionGenerator;
import org.osgi.service.component.annotations.Component;

@Component(property = { "main.thread=true" })
public class AssertionsGeneratorApplication implements Runnable {

	@Override
	public void run() {
		System.err.println("run was called: ");
		String commandlineArgs[] = (String[]) new String[] {};
		if (commandlineArgs.length == 4) {
			Adempiere.startup(false);
			String folder = commandlineArgs[0];
			String modelPackageName = commandlineArgs[1];
			String assertionsPackageName = commandlineArgs[2];
			String entityType = commandlineArgs[3];
			String tableName = commandlineArgs[4];
			ModelAssertionGenerator.generateSource(folder, modelPackageName, assertionsPackageName, entityType, tableName);
		} else if (commandlineArgs.length != 0) {
			System.out.println("usage: ModelGenerator folder modelPackageName assertionsPackageName entityType tableName");
		} else {
			// Initialise iDempiere in the background so that it can start while the user
			// is still filling out the information.
			Thread startupThread = new Thread(() -> Adempiere.startup(false));
			startupThread.start();
			try {
			AssertionsGeneratorDialog dialog = new AssertionsGeneratorDialog(startupThread);
			dialog.setModal(true);
			dialog.pack();
			dialog.setLocationRelativeTo(null);
			dialog.setVisible(true);
			} catch (Exception e) {
				StringWriter w = new StringWriter();
				PrintWriter pw = new PrintWriter(w);
				e.printStackTrace(pw);
				JOptionPane.showMessageDialog(new JFrame(), "Error trying to open assertions generator dialog: \n" + w.toString()
				, "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
