@Library("jenkins-library") _

dockerImagePipeline(
  script: this,
  service: "test",
  dockerfile: "Dockerfile",
  buildContext: ".",
  pushToRegistry: false,
  k8sDeploy: false,
  slackChannel: "#test-devops"
)
