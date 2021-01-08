// Autogenerated from Pigeon (v0.1.17), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package com.idlefish.flutterboost;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import java.util.ArrayList;
import java.util.HashMap;

/** Generated class from Pigeon. */
@SuppressWarnings("unused")
public class Messages {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class CommonParams {
    private String pageName;
    public String getPageName() { return pageName; }
    public void setPageName(String setterArg) { this.pageName = setterArg; }

    private String uniqueId;
    public String getUniqueId() { return uniqueId; }
    public void setUniqueId(String setterArg) { this.uniqueId = setterArg; }

    private String groupName;
    public String getGroupName() { return groupName; }
    public void setGroupName(String setterArg) { this.groupName = setterArg; }

    private Boolean openContainer;
    public Boolean getOpenContainer() { return openContainer; }
    public void setOpenContainer(Boolean setterArg) { this.openContainer = setterArg; }

    private HashMap arguments;
    public HashMap getArguments() { return arguments; }
    public void setArguments(HashMap setterArg) { this.arguments = setterArg; }

    HashMap toMap() {
      HashMap<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("pageName", pageName);
      toMapResult.put("uniqueId", uniqueId);
      toMapResult.put("groupName", groupName);
      toMapResult.put("openContainer", openContainer);
      toMapResult.put("arguments", arguments);
      return toMapResult;
    }
    static CommonParams fromMap(HashMap map) {
      CommonParams fromMapResult = new CommonParams();
      Object pageName = map.get("pageName");
      fromMapResult.pageName = (String)pageName;
      Object uniqueId = map.get("uniqueId");
      fromMapResult.uniqueId = (String)uniqueId;
      Object groupName = map.get("groupName");
      fromMapResult.groupName = (String)groupName;
      Object openContainer = map.get("openContainer");
      fromMapResult.openContainer = (Boolean)openContainer;
      Object arguments = map.get("arguments");
      fromMapResult.arguments = (HashMap)arguments;
      return fromMapResult;
    }
  }

  /** Generated class from Pigeon that represents Flutter messages that can be called from Java.*/
  public static class FlutterRouterApi {
    private final BinaryMessenger binaryMessenger;
    public FlutterRouterApi(BinaryMessenger argBinaryMessenger){
      this.binaryMessenger = argBinaryMessenger;
    }
    public interface Reply<T> {
      void reply(T reply);
    }
    public void pushRoute(CommonParams argInput, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FlutterRouterApi.pushRoute", new StandardMessageCodec());
      HashMap inputMap = argInput.toMap();
      channel.send(inputMap, channelReply -> {
        callback.reply(null);
      });
    }
    public void pushOrShowRoute(CommonParams argInput, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FlutterRouterApi.pushOrShowRoute", new StandardMessageCodec());
      HashMap inputMap = argInput.toMap();
      channel.send(inputMap, channelReply -> {
        callback.reply(null);
      });
    }
    public void showTabRoute(CommonParams argInput, Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FlutterRouterApi.showTabRoute", new StandardMessageCodec());
      HashMap inputMap = argInput.toMap();
      channel.send(inputMap, channelReply -> {
        callback.reply(null);
      });
    }
    public void popRoute(Reply<Void> callback) {
      BasicMessageChannel<Object> channel =
          new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.FlutterRouterApi.popRoute", new StandardMessageCodec());
      channel.send(null, channelReply -> {
        callback.reply(null);
      });
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter.*/
  public interface NativeRouterApi {
    void pushNativeRoute(CommonParams arg);
    void pushFlutterRoute(CommonParams arg);
    void popRoute(CommonParams arg);

    /** Sets up an instance of `NativeRouterApi` to handle messages through the `binaryMessenger` */
    static void setup(BinaryMessenger binaryMessenger, NativeRouterApi api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.NativeRouterApi.pushNativeRoute", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              CommonParams input = CommonParams.fromMap((HashMap)message);
              api.pushNativeRoute(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.NativeRouterApi.pushFlutterRoute", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              CommonParams input = CommonParams.fromMap((HashMap)message);
              api.pushFlutterRoute(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.NativeRouterApi.popRoute", new StandardMessageCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            HashMap<String, HashMap> wrapped = new HashMap<>();
            try {
              @SuppressWarnings("ConstantConditions")
              CommonParams input = CommonParams.fromMap((HashMap)message);
              api.popRoute(input);
              wrapped.put("result", null);
            }
            catch (Exception exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  private static HashMap wrapError(Exception exception) {
    HashMap<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", null);
    return errorMap;
  }
}
