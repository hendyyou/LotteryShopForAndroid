package com.jiuyuhulian.lotteryshop.model;

/**
 * Created by khb on 2017/5/3.
 */

public class bankcardPay {

    /**
     * code : 0
     * data : {"rechargeId":6794}
     */

    private int code;
    private DataBean data;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * rechargeId : 6794
         */

        private int rechargeId;

        public int getRechargeId() {
            return rechargeId;
        }

        public void setRechargeId(int rechargeId) {
            this.rechargeId = rechargeId;
        }
    }
}
