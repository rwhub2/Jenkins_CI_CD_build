pipeline {
    agent //any
    {
        label 'rw_ubuntu'
    }
    stages {
        stage('Build') {
            steps {
                script {
                def builnum = currentBuild.number
                
                echo "Building...${env.Build_ID}"
                
                sh 'python3 cli_script.py'

                //def displayname = currentBuild.currentExecutor.displayName
                //def num = currentBuild.currentExecutor.number
                //echo "Excutor information is  ${displayname} and ${num}"
                
                echo "doing build stuff..."
                
                //def name = currentBuild.agent.name
                
                echo "Building... ${env.NODE_NAME}"
                }
            }
        }
        
        stage('Test') {
            steps {
                echo "Testing..."
                echo "doing test stuff..."
            }
        }
        
    }
    
}
