package com.beratyesbek.graphqlappyoutube.Repository;

import com.beratyesbek.graphqlappyoutube.model.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Integer> {
}
