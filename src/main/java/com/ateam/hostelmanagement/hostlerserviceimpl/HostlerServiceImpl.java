package com.ateam.hostelmanagement.hostlerserviceimpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ateam.hostelmanagement.bean.Expense;
import com.ateam.hostelmanagement.bean.Hostel;
import com.ateam.hostelmanagement.bean.Hostler;
import com.ateam.hostelmanagement.bean.HostlerRoomMapping;
import com.ateam.hostelmanagement.bean.HostlerSearch;
import com.ateam.hostelmanagement.bean.Payments;
import com.ateam.hostelmanagement.bean.Room;
import com.ateam.hostelmanagement.bean.RoomSearch;
import com.ateam.hostelmanagement.hosteldao.HostlerDao;
import com.ateam.hostelmanagement.hostelservice.HostlerService;
import com.ateam.hostelmanagement.settings.Constants;
import com.ateam.hostelmanagement.util.Api;
@Service

public class HostlerServiceImpl implements HostlerService{

	@Autowired
	HostlerDao hostlerDao;
	@Autowired
	Constants constants;
	
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveHostler(Hostler hostler) {
		System.out.println(hostler.getName());
		hostlerDao.saveHostler(hostler);
		
	}
	
	@Transactional
	public List<Hostler> getallhostlers(int page) {
		int offSet=(page-1)*constants.pageSize;
		
		return hostlerDao.getallhostlers(offSet,constants.pageSize);
	}
	
	@Transactional
	public void deleteHostler(long hostlerId) {

		// TODO Auto-generated method stub
		hostlerDao.deleteHostler(hostlerId);
		
	}
	@Transactional
	public void editHostler(Hostler hostler) {
		// TODO Auto-generated method stub
		hostlerDao.editHostler(hostler);
		
	}
	
	public Hostler getHostler(long hostlerId) {
		// TODO Auto-generated method stub
		return hostlerDao.getHostler(hostlerId);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveHostel(Hostel hostel) {
		// TODO Auto-generated method stub
		hostlerDao.saveHostel(hostel);
	}
	@Transactional
	public List<Hostel> getallhostels(int page) {
		int offSet=(page-1)*constants.pageSize;
		
		return hostlerDao.getallhostels(offSet,constants.pageSize);
	}

	@Transactional
	public void deleteHostel(long hostelId) {
		// TODO Auto-generated method stub
		hostlerDao.deleteHostel(hostelId);
		
	}
	@Transactional
	public void editHostel(Hostel hostel) {
		// TODO Auto-generated method stub
		hostlerDao.editHostel(hostel);
		
	}
	
	public Hostel getHostel(long hostelId) {
		// TODO Auto-generated method stub
		return hostlerDao.getHostel(hostelId);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveRoom(Room room) {
		// TODO Auto-generated method stub
		hostlerDao.saveRoom(room);
		
	}
	@Transactional
	public List<Room> getallrooms(int page) {
		// TODO Auto-generated method stub
int offSet=(page-1)*constants.pageSize;
		
		return hostlerDao.getallrooms(offSet,constants.pageSize);
	}
	@Transactional
	public void deleteRoom(long roomId) {
		// TODO Auto-generated method stub
		hostlerDao.deleteRoom(roomId);
		
	}
	@Transactional
	public void editRoom(Room room) {
		// TODO Auto-generated method stub
		hostlerDao.editRoom(room);
	}
	
	public Room getRoom(long roomId) {
		// TODO Auto-generated method stub
		return hostlerDao.getRoom(roomId);
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveExpense(Expense expense) {
		// TODO Auto-generated method stub
	hostlerDao.saveExpense(expense);	
	}
	@Transactional
	public List<Expense> getallExpenses() {
		// TODO Auto-generated method stub
		return hostlerDao.getallExpenses();
	}
	@Transactional
	public void deleteExpense(long expenseId) {
		// TODO Auto-generated method stub
		hostlerDao.deleteExpense(expenseId);
	}
	@Transactional
	public void editExpense(Expense expense) {
		// TODO Auto-generated method stub
		hostlerDao.editExpense(expense);
	}
	@Transactional
	public Expense getExpense(long expenseId) {
		// TODO Auto-generated method stub
		return hostlerDao.getExpense(expenseId);
	}
	
	public void saveAssign(HostlerRoomMapping hostlerRoomMapping) {
		// TODO Auto-generated method stub
		hostlerDao.saveAssign(hostlerRoomMapping);
	}
	
	public List<HostlerRoomMapping> getallAssigns() {
		// TODO Auto-generated method stub
		return hostlerDao.getallAssigns();
	}
	
	public void deleteAssign(long hostlerId) {
		// TODO Auto-generated method stub
		hostlerDao.deleteAssign(hostlerId);
	}
	
	public void editAssign(HostlerRoomMapping hostlerRoomMapping) {
		// TODO Auto-generated method stub
	hostlerDao.editAssign(hostlerRoomMapping);	
	}
	
	public HostlerRoomMapping getAssign(long id) {
		// TODO Auto-generated method stub
		return hostlerDao.getAssign(id);
	}
	
	public List<Room> getAvailableBeds() {
		// TODO Auto-generated method stub
		return hostlerDao.getAvailableBeds();
	}
	
	public List<HostlerRoomMapping> getHostlersRooms() {
		// TODO Auto-generated method stub
		return hostlerDao.getHostlersRooms();
	}
	
	public List<Long> getPaidHostlerIds(String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return hostlerDao.getPaidHostlerIds(fromDate, toDate);
	}
	
	public List<Hostler> getUnPaidHostlerIds(String fromDate, String toDate) {
		// TODO Auto-generated method stub
		return hostlerDao.getUnPaidHostlerIds(fromDate, toDate);
	}
	
	public void savePayment(Payments payments) {
		// TODO Auto-generated method stub
		hostlerDao.savePayment(payments);
		
	}
	
	public List<Payments> getPaymentDetails() {
		// TODO Auto-generated method stub
		return hostlerDao.getPaymentDetails();
	}
	
	public List<Hostler> getHostlerSearch(HostlerSearch hostlerSearch) {
		// TODO Auto-generated method stub
		return hostlerDao.getHostlerSearch(hostlerSearch);
	}
	
	public List<Hostler> getCurrentHostlers() {

		int day=-Api.getGivenFieldFromDateAndTime(DateFormatUtils.format(new Date(), "yyyy-MM-dd"), Api.DateType.DAY);
		Date fromDate=DateUtils.addDays(new Date(), day);
		Date todate=new Date();
		String fromDateInSting=DateFormatUtils.format(fromDate, "yyyy-MM-dd");
		String toDateInstring=DateFormatUtils.format(todate, "yyyy-MM-dd");
		
		
		
		
		
		
		return hostlerDao.getUnPaidHostlerIds(fromDateInSting, toDateInstring);
	}
	
	public List<Room> getRoomSearch(RoomSearch roomSearch) {
		// TODO Auto-generated method stub
		return hostlerDao.getRoomSearch(roomSearch);
	}

	
	public BigDecimal getSpent(String startDate, String endDate) {
		// TODO Auto-generated method stub
		return hostlerDao.getSpent(startDate, endDate);
	}
	
	public BigDecimal getReceived(String startDate, String endDate) {
		// TODO Auto-generated method stub
		return hostlerDao.getReceived(startDate, endDate);
	}
	
	public List<Payments> getPaymentHistory(long hostlerId) {
		// TODO Auto-generated method stub
		return hostlerDao.getPaymentHistory(hostlerId);
	}
	
	public long getHostlersCount() {
		return hostlerDao.getHostlersCount();
	}
	
	
	public long getHostelsCount() {
		// TODO Auto-generated method stub
		return hostlerDao.getHostelsCount();
	}
	
	public long getRoomsCount() {
		// TODO Auto-generated method stub
		return hostlerDao.getRoomsCount();
	}
	
	
	public List<Hostler> getallHostlers2() {
		// TODO Auto-generated method stub
		return hostlerDao.getallHostlers2();
	}


}
