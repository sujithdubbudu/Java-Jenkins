pipeline {
  agent any
  stages {
  stage('Dev') {
      steps {
        script {
          sh 'mvn -B -DskipTests clean package'
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
