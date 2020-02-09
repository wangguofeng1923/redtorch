/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.gateway.ctp.x64v6v3v15v.api;

public class CThostFtdcNotifyQueryAccountField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcNotifyQueryAccountField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcNotifyQueryAccountField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpv6v3v15x64apiJNI.delete_CThostFtdcNotifyQueryAccountField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_Password_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_FutureSerial_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_UserID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_CurrencyID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_TID_get(swigCPtr, this);
  }

  public void setBankUseAmount(double value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankUseAmount_set(swigCPtr, this, value);
  }

  public double getBankUseAmount() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankUseAmount_get(swigCPtr, this);
  }

  public void setBankFetchAmount(double value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankFetchAmount_set(swigCPtr, this, value);
  }

  public double getBankFetchAmount() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_BankFetchAmount_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_ErrorMsg_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return jctpv6v3v15x64apiJNI.CThostFtdcNotifyQueryAccountField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcNotifyQueryAccountField() {
    this(jctpv6v3v15x64apiJNI.new_CThostFtdcNotifyQueryAccountField(), true);
  }

}