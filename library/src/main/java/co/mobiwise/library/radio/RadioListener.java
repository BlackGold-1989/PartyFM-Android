package co.mobiwise.library.radio;


public interface RadioListener {

  void onRadioLoading();

  void onRadioConnected();

  void onRadioStarted();

  void onRadioStopped();

  void onMetaDataReceived(String s, String s2);

  void onAudioSessionId(int audioSessionId);

  void onError();
}
