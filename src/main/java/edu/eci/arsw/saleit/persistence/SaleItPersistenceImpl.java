package edu.eci.arsw.saleit.persistence;

import edu.eci.arsw.saleit.model.User;
import edu.eci.arsw.saleit.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleItPersistenceImpl implements SaleItPersistence {

    @Autowired
    private UserRepo userRepo;


    @Override
    public void addUser(User user) throws SaleItPersistenceException {
        userRepo.save(user);
    }


}
