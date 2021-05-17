pipeline {
    agent any

    stages {
        // stage('Checkout') {
        //     steps {
        //         // Get some code from a GitHub repository
        //         git 'https://github.com/jorgeluispalomino88/LearningJenkins.git'
        //     }
        // }
        
            stage('Compile') {
            steps {
                sh './gradlew compileJava'
            }
        }
        
        stage('Unit test') {
            steps {
                sh './gradlew test'
            }
        }
    }
}

