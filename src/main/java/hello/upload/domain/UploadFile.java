package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private final String uploadFileName;
    private final String storeFileName;

}
