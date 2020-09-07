package org.serein;

import org.aquiver.Aquiver;

/**
 * @author WangYi
 * @since 2020/9/2
 */
public class SereinApplication {
  public static void main(String[] args) {
    Aquiver.of().start(SereinApplication.class, args);
  }
}
