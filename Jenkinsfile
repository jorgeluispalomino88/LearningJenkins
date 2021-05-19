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
                sh 'mvn compile'
            }
        }

        stage('Unit test') {
            steps {
                sh 'mvn test'
            }
        }
    }
}

