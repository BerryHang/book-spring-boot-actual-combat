package com.learning.spring.boot.domain.entity;

import java.io.Serializable;

/**
 * qrtz_blob_triggers
 * @author 
 */
public class QrtzBlobTriggers extends QrtzBlobTriggersKey implements Serializable {
    private byte[] blobData;

    private static final long serialVersionUID = 1L;

    public byte[] getBlobData() {
        return blobData;
    }

    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
    }
}