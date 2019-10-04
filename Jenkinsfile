pipeline {
  agent any
  stages {
    stage('SHELL') {
      steps {
        sh 'mvn clean install -Dlicense.skip=true'
      }
    }
  }
}