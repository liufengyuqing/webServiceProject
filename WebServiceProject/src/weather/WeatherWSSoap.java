/**
 * WeatherWSSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package weather;

public interface WeatherWSSoap extends java.rmi.Remote {

    /**
     * <br /><h3>获得中国省份、直辖市、地区；国家名称（国外）和与之对应的ID</h3><p>输入参数：无，返回数据：DataSet�?</p><br
     * />
     */
    public weather.GetRegionDatasetResponseGetRegionDatasetResult getRegionDataset() throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得中国省份、直辖市、地区和与之对应的ID</h3><p>输入参数：无，返回数据：�?维字符串数组�?</p><br
     * />
     */
    public java.lang.String[] getRegionProvince() throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得国外国家名称和与之对应的ID</h3><p>输入参数：无，返回数据：�?维字符串数组�?</p><br
     * />
     */
    public java.lang.String[] getRegionCountry() throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得支持的城�?/地区名称和与之对应的ID</h3><p>输入参数：theRegionCode =
     * 省市、国家ID或名称，返回数据：DataSet�?</p><br />
     */
    public weather.GetSupportCityDatasetResponseGetSupportCityDatasetResult getSupportCityDataset(java.lang.String theRegionCode) throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得支持的城�?/地区名称和与之对应的ID</h3><p>输入参数：theRegionCode =
     * 省市、国家ID或名称，返回数据：一维字符串数组�?</p><br />
     */
    public java.lang.String[] getSupportCityString(java.lang.String theRegionCode) throws java.rmi.RemoteException;

    /**
     * <br /><h3>获得天气预报数据</h3><p>输入参数：城�?/地区ID或名称，返回数据：一维字符串数组�?</p><br
     * />
     */
    public java.lang.String[] getWeather(java.lang.String theCityCode, java.lang.String theUserID) throws java.rmi.RemoteException;
}
