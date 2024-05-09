package com.dyze.metadata;

import java.util.Date;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dyze.metadata.models.MetadataRestModel;

@RestController
@RequestMapping("/api/metadata")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MetadataController {
     
     
     @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity<MetadataRestModel> getMetadata() {
          MetadataRestModel metadata = new MetadataRestModel();
          metadata.setId("1");
          metadata.setName("image");
          metadata.setCaption("This is an image");
          metadata.setHeight(100);
          metadata.setWidth(100);

          metadata.setCreationDate(new Date());
          return new ResponseEntity<>(metadata, HttpStatus.OK);
     }

}
