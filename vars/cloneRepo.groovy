def call(){
	dir('cloned'){
		checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[url: 'https://github.com/shashankmittra/simple-text.git']]])
	}
}
