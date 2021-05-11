package ro.ase.csie.cts.dp.command;

import java.util.ArrayList;

public class TaskManager {

	ArrayList<AsyncTask> tasks = new ArrayList<>();
	
	public void addAsyncTask(AsyncTask task)
	{
		tasks.add(task);
	}
	
	//round robin - queue - fifo
	public void execute()
	{
		if(tasks.size()>0)
		{
		AsyncTask taskToExecute = tasks.get(0);
		if(taskToExecute!=null)
		{
			tasks.remove(0);
			taskToExecute.asyncExecute();
		}
		}
	}
	
}