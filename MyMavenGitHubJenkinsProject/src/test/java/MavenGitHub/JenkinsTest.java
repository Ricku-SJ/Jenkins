package MavenGitHub;

import org.testng.Reporter;
import org.testng.annotations.Test;

import MavenJenkins.ActiTimeTests;

public class JenkinsTest extends ActiTimeTests {

	@Test
	public void createActi()
	{
		Reporter.log("Create Acti",true);
	}
	@Test
	public void modifyActi()
	{
		Reporter.log("Modify Acti",true);
	}
	
}
