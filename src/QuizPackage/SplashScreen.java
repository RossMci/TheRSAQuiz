package QuizPackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ross Mcinerney
 */
public class SplashScreen
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		RSASplash rSASplash = new RSASplash();
		OptionsJFrame OptionsJFrame = new OptionsJFrame();
		rSASplash.setVisible(true);
		try
		{
			for(int i=0;i<=100;i++){
				Thread.sleep(60);
					RSASplash.PercentjLabel.setText(""+i);
					RSASplash.ProgressBar.setValue(i);
			}
			rSASplash.setVisible(false);
			OptionsJFrame.setVisible(true);
		}
		catch(InterruptedException e) 
		{
			
		}
	}

}
