@Library("jenkins-library") _

dockerImagePipeline(
    script: this,
    service: "test",
    k8sDeploy: false,
    slackChannel: "#infrastructure",
    app: "test"
)