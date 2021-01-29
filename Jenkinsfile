@Library('git@master') _

pipeline{
	agent any

	stages{
		stage("clone"){
			steps{
				echo "started cloning"
				cloneRepo()
				echo "done cloning"
			}
		}
	}
}
