job('example-DSL_SCM') {
	description('Primer proyecto DSL')  
  	scm 
  	{
      git('https://github.com/macloujulian/jenkins.job.parametrizado.git', 'main' ) { node -> 
  	   node / gitConfigName('msunderground')
       node / gitConfigEmail('miguelangel8257@hotmail.com')
    	}
    }
  	triggers{
  		cron('H/7 * * * *')
    }
  	steps{
      shell("bash jobscript.sh")
    }
}
