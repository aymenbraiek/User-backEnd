properties(
    [
        [$class: 'BuildDiscarderProperty', strategy:
          [$class: 'LogRotator', artifactDaysToKeepStr: '14', artifactNumToKeepStr: '5', daysToKeepStr: '30', numToKeepStr: '60']],
        pipelineTriggers(
          [
              pollSCM('H/15 * * * *'),
              cron('@daily'),
          ]
        )
    ]
)
pipeline {

  agent any
    stages {
        stage ('Build Servlet Project') {
            steps {
                /*For windows machine */
              // bat  'mvn clean package'

                /*For Mac & Linux machine */
               // sh  'mvn  -B -DskipTests clean package'
                echo 'step +++++'
            }

            post{
                success{
                    echo 'Now Archiving ....'

                 // archiveArtifacts artifacts :'target/*.war'
                }
            }
        }
        }}