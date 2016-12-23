package com.yxb.baihui.baihui.weathernews.view;

import com.yxb.baihui.baihui.weathernews.bean.WeathernewsBean;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public interface WeathernewsView {

    void showProgress();
    void hideProgress();
    void showWeatherLayout();

    void setCity(String city);
    void setToday(String data);
    void setTemperature(String temperature);
    void setWind(String wind);
    void setWindPower(String windpower);
    void setWeather(String weather);
    void setWeek(String week);
    void setWeatherImage(String res);
    void setfutureWeatherData(List<WeathernewsBean> lists);

    void showErrorToast(String msg);

}
