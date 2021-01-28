@Library('git@master') _

pipeline{
	agent any

	stages{
		stage("clone"){
			steps{
				echo "Hello"
				dir ('/cloned'){
					first ()
				}
				echo "done"
				echo "Workspace location: ${env.WORKSPACE}"
			}
		}
	}
}
