def call(){
    node() {
        agent any
        stages{
            stage("Hello"){
                steps{
                    sh 'ls -al'
                }
            }
        }
    }
}
