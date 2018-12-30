package com.devglan.Userportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @RequestMapping(value="/users",method= RequestMethod.GET)
    public List<User> getUsers()
    {
        return repository.findAll();}

    @RequestMapping(value="/users/{id}",method=RequestMethod.GET)
    public Optional<User> getUser(@PathVariable Long id)
    {
        return repository.findById(id);}


    @RequestMapping(value="/users",method=RequestMethod.POST)
    public User save(@RequestBody User user)
    {
        return repository.save(user);
    }



    @SuppressWarnings("deprecation")
    @RequestMapping(value="/chercheUser",method=RequestMethod.GET)
    public Page<User> ChercherByNom(@RequestParam(name="mc",defaultValue="") String mc,
                                    @RequestParam(name="page",defaultValue="0")   int page,
                                    @RequestParam(name="size",defaultValue="5")   int size)
    {
        return repository.charcherByMotcle("%"+mc+"%", new PageRequest(page, size));
    }


    @RequestMapping(value="/users/{id}",method=RequestMethod.DELETE)
    public boolean delete(@PathVariable Long id)
    {
        repository.deleteById(id);
        return  true;
    }

    @RequestMapping(value="/users/{id}",method=RequestMethod.PUT)
    public User edit(@PathVariable Long id,@RequestBody User u)
    {
        u.setId(id);
        return repository.save(u) ;}

}
