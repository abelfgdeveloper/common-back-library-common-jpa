package es.abelfgdeveloper.common.jpa.mapper;

import es.abelfgdeveloper.common.domain.PaginationOut;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PaginationMapper {

  public PaginationOut map(Page<? extends Object> page) {
    return PaginationOut.builder()
        .page(page.getNumber())
        .size(page.getSize())
        .numberOfElements(page.getNumberOfElements())
        .totalPages(page.getTotalPages())
        .totalElements(page.getTotalElements())
        .first(page.isFirst())
        .last(page.isLast())
        .build();
  }
}
