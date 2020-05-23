node {
   
    // Mark the code checkout 'stage'....
       stage 'Checkout'

       git url: 'https://github.com/kapilgidwani/myfirstdockerapp.git'

       // Get the maven tool.
       // ** NOTE: This 'M3' maven tool must be configured
       // **       in the global configuration.
       def mvnHome = tool 'MAVEN_HOME'

       // Mark the code build 'stage'....
       stage 'Build'
       // Run the maven build
       sh "${mvnHome}/bin/mvn -Dmaven.test.failure.ignore clean package"


}