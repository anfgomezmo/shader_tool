
/**
 * you can put a one sentence description of your tool here.
 *
 * ##copyright##
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 * 
 * @author		##author##
 * @modified	##date##
 * @version		##version##
 */

package Shader.tool;

import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.apache.lucene.queryparser.classic.ParseException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.TransportException;

import processing.app.*;
import processing.app.tools.*;
import processing.app.Base;
import processing.app.Editor;
import processing.app.Sketch;
import processing.app.SketchCode;
import processing.core.PApplet;
import Shader.tool.Wizard;
import Shader.tool.Save;

 
/**
 * GUI tool for shaderbase
 */

public class ShaderTool extends JFrame implements Tool{ 
 //public class ShaderTool implements Tool {
	private processing.app.Editor editor;	
	private Wizard info;
  //Editor editor;
 
 //Variables 

	

public String getMenuTitle() {
	    return "ShaderBase";
}

public void init(Editor editor) {
this.editor = editor;
}

//public void init(processing.app.Editor theEditor) {
//	this.editor = theEditor;
//}







public void run() {
	
			Sketch sketch = editor.getSketch();
			File sketchFolder = sketch.getFolder();
			File sketchbookFolder = Base.getSketchbookFolder();
			
	        //Create and set up the window.
	        JFrame frame = new JFrame("ShaderBase");
	        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        //Create and set up the content pane.
	        
	        
	        
	        Wizard ini = new Wizard(editor);
	        try {
				try {
					ini.addComponentToPane(frame.getContentPane());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (TransportException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (GitAPIException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 
	        //Display the window.
	        
	        
	        	        
	        frame.pack();
	        frame.setSize(820,550);
	        frame.setResizable(false); //No Resize
	        frame.setVisible(true);
	   

}

	
	

}

 
	