package com.Api.Pedro.Repository.NorthWind;

import com.Api.Pedro.Entities.NorthWind.CategoriesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepository extends JpaRepository<CategoriesEntity,Long> {


}
