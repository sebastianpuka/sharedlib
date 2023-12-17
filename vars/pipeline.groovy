def call(Map config=[:]){
    pipeline {
        agent any
        stages{
            stage("Hello"){
                steps{
                    echo "${config.name}"
                }
            }
        }
    }
}
