/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryAcctInfoRequest extends AbstractModel{

    /**
    * 聚鑫平台分配的支付MidasAppId
    */
    @SerializedName("MidasAppId")
    @Expose
    private String MidasAppId;

    /**
    * 业务平台的子商户Id，唯一
    */
    @SerializedName("SubMchId")
    @Expose
    private String SubMchId;

    /**
    * 由平台客服提供的计费密钥Id
    */
    @SerializedName("MidasSecretId")
    @Expose
    private String MidasSecretId;

    /**
    * 计费签名
    */
    @SerializedName("MidasSignature")
    @Expose
    private String MidasSignature;

    /**
     * Get 聚鑫平台分配的支付MidasAppId 
     * @return MidasAppId 聚鑫平台分配的支付MidasAppId
     */
    public String getMidasAppId() {
        return this.MidasAppId;
    }

    /**
     * Set 聚鑫平台分配的支付MidasAppId
     * @param MidasAppId 聚鑫平台分配的支付MidasAppId
     */
    public void setMidasAppId(String MidasAppId) {
        this.MidasAppId = MidasAppId;
    }

    /**
     * Get 业务平台的子商户Id，唯一 
     * @return SubMchId 业务平台的子商户Id，唯一
     */
    public String getSubMchId() {
        return this.SubMchId;
    }

    /**
     * Set 业务平台的子商户Id，唯一
     * @param SubMchId 业务平台的子商户Id，唯一
     */
    public void setSubMchId(String SubMchId) {
        this.SubMchId = SubMchId;
    }

    /**
     * Get 由平台客服提供的计费密钥Id 
     * @return MidasSecretId 由平台客服提供的计费密钥Id
     */
    public String getMidasSecretId() {
        return this.MidasSecretId;
    }

    /**
     * Set 由平台客服提供的计费密钥Id
     * @param MidasSecretId 由平台客服提供的计费密钥Id
     */
    public void setMidasSecretId(String MidasSecretId) {
        this.MidasSecretId = MidasSecretId;
    }

    /**
     * Get 计费签名 
     * @return MidasSignature 计费签名
     */
    public String getMidasSignature() {
        return this.MidasSignature;
    }

    /**
     * Set 计费签名
     * @param MidasSignature 计费签名
     */
    public void setMidasSignature(String MidasSignature) {
        this.MidasSignature = MidasSignature;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MidasAppId", this.MidasAppId);
        this.setParamSimple(map, prefix + "SubMchId", this.SubMchId);
        this.setParamSimple(map, prefix + "MidasSecretId", this.MidasSecretId);
        this.setParamSimple(map, prefix + "MidasSignature", this.MidasSignature);

    }
}

