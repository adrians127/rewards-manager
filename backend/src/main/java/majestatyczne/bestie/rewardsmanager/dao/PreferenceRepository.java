package majestatyczne.bestie.rewardsmanager.dao;

import majestatyczne.bestie.rewardsmanager.model.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference, Integer> {
}