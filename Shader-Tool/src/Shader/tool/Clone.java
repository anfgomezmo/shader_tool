package Shader.tool;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;



import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.ProgressMonitor;

import processing.app.Editor;
import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.CommitCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.errors.ConcurrentRefUpdateException;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.NoFilepatternException;
import org.eclipse.jgit.api.errors.NoHeadException;
import org.eclipse.jgit.api.errors.NoMessageException;
import org.eclipse.jgit.api.errors.TransportException;
import org.eclipse.jgit.api.errors.WrongRepositoryStateException;
import org.eclipse.jgit.errors.UnmergedPathException;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.PushResult;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;


class Clone {

	
	
	public Clone(String args[], Path pathos) throws TransportException, GitAPIException, IOException{
		
		String repo = pathos.toString()+"/Data"; 
		String name = "Shadertool";
		String password = "1ergosum";
		String url = "https://github.com/Shadertool/shaderdb.git";
		
		// credentials
		CredentialsProvider cp = new UsernamePasswordCredentialsProvider(name, password);
		// clone
		File dir = new File(repo);
		CloneCommand cc = new CloneCommand()
		.setCredentialsProvider(cp)
		.setDirectory(dir)
		.setURI(url);
	
		Git git = cc.call();
		// add
		AddCommand ac = git.add();
		ac.addFilepattern(".");
		try {
		ac.call();
		} catch (NoFilepatternException e) {
		e.printStackTrace();
		}

		
		 
		// cleanup
		dir.deleteOnExit();
		}


	
}//end Clone