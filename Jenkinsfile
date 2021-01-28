@Library('git@master') _

pipeline{
	agent any

	stages{
		stage("clone"){
			steps{
				echo "Hello"
				dir ('/home/shashankmittra/cloned'){
					first ()
				}
				echo "done"
				echo "Workspace location: ${env.WORKSPACE}"
			}
		}
	}
}
