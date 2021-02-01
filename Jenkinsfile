@Library('git@master') _

pipeline{
	agent any

	stages{
		stage("clone"){
			steps{
				echo "started cloning"
				cloneRepo('*/main','https://github.com/shashankmittra/simple-text.git')
				cloneRepo('*/feature','https://github.com/shashankmittra/simple-text.git')
				echo "done cloning"
			}
		}
	}
}
