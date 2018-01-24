package com.babiel.tg.sandbox.microservices.models;

import java.io.Serializable;

/**
 * @author t.gippert
 */
public class MessageModel implements Serializable {

  private String message;

  /**
   * Getter for property 'message'.
   *
   * @return Value for property 'message'.
   */
  public String getMessage() {
    return message;
  }

  /**
   * Setter for property 'message'.
   *
   * @param message Value to set for property 'message'.
   */
  public void setMessage(final String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    return "{\"message\":\"" + message + "\"}";
  }
}
