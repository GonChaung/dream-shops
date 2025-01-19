package dev.gonchaung.dreamshops.service.image;

import dev.gonchaung.dreamshops.dto.ImageDto;
import dev.gonchaung.dreamshops.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    List<ImageDto> saveImages(List<MultipartFile> file, Long productId);
    void updateImage(MultipartFile file, Long imageId);
}
