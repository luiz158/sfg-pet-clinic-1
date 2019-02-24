package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.stfpetclinic.model.PetType;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service // == if this is missing spring will miss this ==
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements OwnerMapService.PetTypeService {


    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {

    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}
