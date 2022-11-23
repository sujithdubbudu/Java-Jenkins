pipeline {
  agent any
  stages {
  stage('Dev') {
      steps {
        script {
          sh 'mvn build'
        }
      }
    }
  stage('Test') {
      steps {
        script {
          echo 'Stage 2'
        }
      }
    }
  }
}
