package com.github.imas.rdflint;

import java.util.List;

public class RdfLintParameters {

  private String targetDir;
  private String originDir;
  private String baseUri;
  private List<CustomRule> rules;

  public String getTargetDir() {
    return targetDir;
  }

  public void setTargetDir(String targetDir) {
    this.targetDir = targetDir;
  }

  public String getOriginDir() {
    return originDir;
  }

  public void setOriginDir(String originDir) {
    this.originDir = originDir;
  }
  
  public String getBaseUri() {
    return baseUri;
  }

  public void setBaseUri(String baseUri) {
    this.baseUri = baseUri;
  }

  public List<CustomRule> getRules() {
    return rules;
  }

  public void setRules(List<CustomRule> rules) {
    this.rules = rules;
  }
}
