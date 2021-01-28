String branchName = env.BRANCH_NAME
String repoUrl = "https://github.com/shashankmittra/simple-text.git"

node {
  // Start Stages
  stage('Clone') {
      // Clones the repository from the current branch name
      echo 'Make the output directory'
      sh 'mkdir -p build'

      echo 'Cloning files from (branch: "' + branchName + '" )'
      dir('build') {
          git branch: branchName, url: repoUrl
      }     
  }       
}
