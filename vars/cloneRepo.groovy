def call(def branchName, def gitUrl){
	dir('cloned'){
		checkout([$class: 'GitSCM', branches: [[name: branchName]], userRemoteConfigs: [[url: gitUrl]]])
	}
}
