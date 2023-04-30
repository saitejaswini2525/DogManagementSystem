/* 
 * @author Yarapathineni Saitejaswini
 */

package com.yarapathineniClasses.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
	@Id
	public int getTrainerId() {
		return trainerId;
	}
	@Override
	public String toString() {
		return "Trainer [trainerId=" + trainerId + ", trainerName=" + trainerName + ", trainerAddress=" + trainerAddress
				+ "]";
	}
	public void setTrainerId(int trainerId) {
		this.trainerId = trainerId;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerAddress() {
		return trainerAddress;
	}
	public void setTrainerAddress(String trainerAddress) {
		this.trainerAddress = trainerAddress;
	}
	private int trainerId;
	private String trainerName;
	private String trainerAddress;
	

}