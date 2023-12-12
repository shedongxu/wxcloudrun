package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 消息控制器
 */
@RestController
public class MessageController {

  final Logger logger;

  public MessageController() {
    this.logger = LoggerFactory.getLogger(MessageController.class);
  }


  /**
   * 接收用户消息
   * @return API response json
   */
  @PostMapping(value = "/msg/receive")
  ApiResponse receiveMsg(@RequestBody JSONObject jsonObject) {
    logger.info(jsonObject.toString());

    return ApiResponse.ok(jsonObject);
  }
  
}