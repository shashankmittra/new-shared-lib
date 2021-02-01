def call(string branchName, string gitUrl){
	dir('cloned'){
		checkout([$class: 'GitSCM', branches: [[name: branchName]], userRemoteConfigs: [[url: gitUrl]]])
	}
}
