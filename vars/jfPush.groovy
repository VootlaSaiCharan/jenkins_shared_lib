def cal(){
  sh 'curl -X PUT -u admin:charan@Akash.98 -T /var/lib/jenkins/workspace/java-3.0/target/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://35.171.28.175:8082/artifactory/example-repo-local/kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar'
}
