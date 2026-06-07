package lk.jiat.rmi;

import lk.jiat.rmi.client.UserService;
import lk.jiat.rmi.model.User;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class UserServiceImpl extends UnicastRemoteObject implements UserService {

    public UserServiceImpl() throws RemoteException {

    }

    @Override
    public User getUserById(int id) throws RemoteException {
        return null;
    }

    @Override
    public void addUser(User user) throws RemoteException {

    }

    @Override
    public void updateUser(User user) throws RemoteException {

    }

    @Override
    public void deleteUser(int id) throws RemoteException {

    }

    @Override
    public List<User> getAllUsers() throws RemoteException {
        return List.of();
    }
}
